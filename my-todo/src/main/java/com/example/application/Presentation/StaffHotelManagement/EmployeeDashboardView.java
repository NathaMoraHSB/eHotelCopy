package com.example.application.Presentation.StaffHotelManagement;
import com.example.application.Common.User;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.theme.lumo.LumoUtility;
import com.example.application.Presentation.User.HomepageView;

@Route(value = "EmployeeDashboard", layout = HomepageView.class)
@PageTitle("Employee Dashboard")
public class EmployeeDashboardView extends VerticalLayout {

    private User loggedUser;
    private Binder<User> binder = new Binder<>(User.class);

    public EmployeeDashboardView() {
        this.loggedUser = (User) VaadinSession.getCurrent().getAttribute("user");

        if (this.loggedUser == null) {
            Notification.show("You must be logged in to access the dashboard.");
            UI.getCurrent().navigate("LoginView");
            return;
        }

        setSizeFull();
        setPadding(false);
        setSpacing(false);
        addClassName("dashboard-view");

        // Header layout setup
        HorizontalLayout headerLayout = createHeader();
        add(headerLayout);

        // Content layout setup
        VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.addClassName("content-layout");
        contentLayout.setSizeFull();
        add(contentLayout);

        // Metrics layout setup
        HorizontalLayout metricsLayout = createMetricsLayout();
        contentLayout.add(metricsLayout);
        contentLayout.setFlexGrow(1, metricsLayout);
    }

    private HorizontalLayout createHeader() {
        HorizontalLayout headerLayout = new HorizontalLayout();
        headerLayout.setWidthFull();
        headerLayout.setDefaultVerticalComponentAlignment(Alignment.CENTER);
        headerLayout.addClassName("header-layout");

        H1 dashboardTitle = new H1("Employee Dashboard");
        dashboardTitle.addClassName("header-title");

        // Begrüßungstext hinzufügen
        Paragraph welcomeText = new Paragraph("Hello, " + loggedUser.getName());
        welcomeText.addClassNames("welcome-text");
        welcomeText.getStyle().set("cursor", "pointer");
        welcomeText.addClickListener(e -> openEmployeeDataDialog());

        Button logoutButton = new Button("Logout", VaadinIcon.SIGN_OUT.create());
        logoutButton.addClassName("logout-button");
        logoutButton.addClickListener(e -> UI.getCurrent().navigate(""));

        // Alle Elemente zum Header hinzufügen
        headerLayout.add(dashboardTitle, welcomeText, logoutButton);
        headerLayout.expand(dashboardTitle); // Stellen Sie sicher, dass der Titel den verfügbaren Raum ausnutzt
        headerLayout.setAlignItems(Alignment.CENTER);

        return headerLayout;
    }

    private HorizontalLayout createMetricsLayout() {
        HorizontalLayout metricsLayout = new HorizontalLayout();
        metricsLayout.addClassName("metrics-layout");
        metricsLayout.setWidthFull();
        metricsLayout.setJustifyContentMode(JustifyContentMode.EVENLY);

        metricsLayout.add(
                createDashboardItem("Today's Arrivals", "10", VaadinIcon.SIGN_IN),
                createDashboardItem("Today's Departures", "5", VaadinIcon.SIGN_OUT),
                createDashboardItem("Occupied Rooms", "75", VaadinIcon.WORKPLACE),
                createDashboardItem("Pending Bookings", "3", VaadinIcon.CALENDAR_CLOCK)
        );

        return metricsLayout;
    }

    private Div createDashboardItem(String title, String count, VaadinIcon icon) {
        Div item = new Div();
        item.addClassName("dashboard-item");
        Icon itemIcon = icon.create();
        itemIcon.setSize("24px");

        H2 itemCount = new H2(count);
        itemCount.addClassName("dashboard-item-count");

        Paragraph itemTitle = new Paragraph(title);
        itemTitle.addClassName("dashboard-item-title");

        item.add(itemIcon, itemCount, itemTitle);
        return item;
    }

    private void openEmployeeDataDialog() {
        User loggedUser = (User) VaadinSession.getCurrent().getAttribute("user");
        if (loggedUser != null) {
            Dialog dialog = new Dialog();
            VerticalLayout contentLayout = new VerticalLayout();
            contentLayout.setSpacing(true);

            TextField lastNameField = new TextField("Last Name");
            TextField addressField = new TextField("Address");
            PasswordField oldPasswordField = new PasswordField("Old Password");
            PasswordField newPasswordField = new PasswordField("New Password");
            PasswordField confirmPasswordField = new PasswordField("Confirm Password");

            binder.forField(lastNameField)
                    .asRequired("Last name is required")
                    .bind(User::getLastname, User::setLastname);
            binder.forField(addressField)
                    .asRequired("Address is required")
                    .bind(User::getAddress, User::setAddress);
            binder.forField(oldPasswordField)
                    .asRequired("Old password is required")
                    .bind(User::getPassword, null);
            binder.forField(newPasswordField)
                    .asRequired("New password is required")
                    .bind(null, User::setPassword);

            Button saveButton = new Button("Save", event -> {
                if (binder.validate().isOk()) {
                    if (!oldPasswordField.getValue().equals(loggedUser.getPassword())) {
                        Notification.show("The entered old password is incorrect.", 2000, Notification.Position.MIDDLE);
                        return;
                    }
                    if (!newPasswordField.getValue().equals(confirmPasswordField.getValue())) {
                        Notification.show("The entered passwords do not match.", 2000, Notification.Position.MIDDLE);
                        return;
                    }
                    try {
                        loggedUser.setLastname(lastNameField.getValue());
                        loggedUser.setAddress(addressField.getValue());
                        loggedUser.setPassword(newPasswordField.getValue());
                        VaadinSession.getCurrent().setAttribute("user", loggedUser);
                        // Assuming update is a method to save changes in your data layer
                        //update(loggedUser);

                        dialog.close();
                        Notification.show("Employee data successfully updated.", 3000, Notification.Position.MIDDLE);
                    } catch (Exception e) {
                        Notification.show("Error updating employee data.", 2000, Notification.Position.MIDDLE);
                    }
                }
            });

            Button cancelButton = new Button("Cancel", event -> dialog.close());

            contentLayout.add(lastNameField, addressField, oldPasswordField, newPasswordField, confirmPasswordField, saveButton, cancelButton);
            dialog.add(contentLayout);
            dialog.open();
        }
    }

}
