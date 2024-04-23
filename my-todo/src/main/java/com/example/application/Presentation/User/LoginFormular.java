package com.example.application.Presentation.User;

import com.example.application.Common.Customer;
import com.example.application.Common.Employee;
import com.example.application.Common.User;
import com.example.application.Domain.Domain;
import com.example.application.Domain.Interfaces.IDomain;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;


@PageTitle("Login")
@Route(value = "LoginView")
public class LoginFormular extends Div {
/**
    private IDomain domain;


    private static final String REGISERFORMULAR_VIEW = "REGISERFORMULAR";
    private static final String HOMEPAGE_VIEW = "";

    public LoginFormular() {

        domain = new Domain();



        VerticalLayout mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();
        mainLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        mainLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);


        LoginForm loginForm = new LoginForm();

        loginForm.addLoginListener(e -> {
            User user = domain.login(e.getUsername(), e.getPassword());

            if (user != null) {
                Notification.show("Login successful!", 3000, Notification.Position.MIDDLE)
                        .addThemeVariants(NotificationVariant.LUMO_SUCCESS);

                if (user instanceof Employee) {

                    getUI().ifPresent(ui -> ui.navigate("EmployeeDashboard"));
                } else if (user instanceof Customer) {

                    getUI().ifPresent(ui -> ui.navigate("CustomerView"));
                }
            } else {
                loginForm.setError(true);
                Notification.show("Login failed: Invalid username or password", 3000, Notification.Position.MIDDLE)
                        .addThemeVariants(NotificationVariant.LUMO_ERROR);
            }
        });


        Button registerierenButton = erstelleButton("Register Now", REGISERFORMULAR_VIEW);
        Button zurueckButton = erstelleButton("Back to the homepage", HOMEPAGE_VIEW);


        mainLayout.add(loginForm);


        add(mainLayout , registerierenButton, zurueckButton);
    }

    private Button erstelleButton(String buttonText, String navigationPath) {
        Button button = new Button(buttonText);
        button.addClickListener(e -> getUI().ifPresent(ui -> ui.navigate(navigationPath)));
        return button;
    }**/
}