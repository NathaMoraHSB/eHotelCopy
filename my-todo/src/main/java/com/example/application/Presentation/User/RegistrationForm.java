package com.example.application.Presentation.User;

import com.example.application.Domain.Domain;
import com.example.application.Domain.Interfaces.IDomain;

import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;



import java.util.stream.Stream;

@PageTitle("Registration")
@Route(value = "REGISERFORMULAR",layout = HomepageView.class)
public class RegistrationForm extends FormLayout {

  //  private UserManagement userManagement;
    private IDomain domain;
    private H3 title;

    TextField username;
    private TextField firstName;
    private TextField lastName;

    private TextField address;
    private RadioButtonGroup<String> paymentMethod;
    private EmailField email;

    private PasswordField password;
    private PasswordField passwordConfirm;

    private Checkbox allowMarketing;

    private Span errorMessageField;

    private Button submitButton;


    public RegistrationForm() {

        this.domain = new Domain();



        title = new H3("Become a Member");
        username = new TextField("Username");
        firstName = new TextField("First name");
        lastName = new TextField("Last name");
        email = new EmailField("Email");
        address = new TextField("Address");
        paymentMethod = new RadioButtonGroup<>();
        paymentMethod.setLabel("Payment Method");
        paymentMethod.setItems("Cash", "Credit");
        paymentMethod.setValue("Cash");

        allowMarketing = new Checkbox("Allow Marketing Emails?");
        allowMarketing.getStyle().set("margin-top", "10px");

        password = new PasswordField("Password");
        passwordConfirm = new PasswordField("Confirm password");

        setRequiredIndicatorVisible(firstName, lastName, email, password,
                passwordConfirm);

        errorMessageField = new Span();

        submitButton = new Button("Join the community", VaadinIcon.USER_CHECK.create());
        submitButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);



        add(title,username, firstName, lastName, email, password,address, paymentMethod,
                passwordConfirm, allowMarketing, errorMessageField,
                submitButton);


        setMaxWidth("500px");

        setResponsiveSteps(
                new ResponsiveStep("0", 1, ResponsiveStep.LabelsPosition.TOP),
                new ResponsiveStep("490px", 2, ResponsiveStep.LabelsPosition.TOP));

        // These components always take full width
        setColspan(title, 2);
        setColspan(email, 2);
        setColspan(errorMessageField, 2);
        setColspan(submitButton, 2);

        title.addClassNames("my-title-style");
        // Adding an icon to the submit button
        submitButton.setIcon(VaadinIcon.USER_CHECK.create());

        // Add click listener for feedback
        submitButton.addClickListener(event -> {
            // boolean isValid =
            if (validateForm()) {
                //todo here in the presentation layer is the IDomain the class which needs to be instanced
                boolean success = domain.registerCustomer(
                        username.getValue(),
                        password.getValue(),
                        firstName.getValue(),
                        lastName.getValue(),
                        address.getValue(),
                        email.getValue(),
                        paymentMethod.getValue()
                );
                if (success) {

                    Notification.show("Registration successful!")
                            .addThemeVariants(NotificationVariant.LUMO_SUCCESS);

                } else {
                    Notification.show("Registration failed. Username might be taken or fields are invalid.")
                            .addThemeVariants(NotificationVariant.LUMO_ERROR);
                }
            } else {

                Notification.show("Please check your input!")
                        .addThemeVariants(NotificationVariant.LUMO_ERROR);
            }
        });


        getStyle().set("padding", "20px")
                .set("box-shadow", "0 4px 6px -1px rgba(0,0,0,0.1), 0 2px 4px -1px rgba(0,0,0,0.06)");
    }

    public PasswordField getPasswordField() { return password; }

    public PasswordField getPasswordConfirmField() { return passwordConfirm; }

    public Span getErrorMessageField() { return errorMessageField; }

    public Button getSubmitButton() { return submitButton; }

    private void setRequiredIndicatorVisible(HasValueAndElement<?, ?>... components) {
        Stream.of(components).forEach(comp -> comp.setRequiredIndicatorVisible(true));
    }

    private boolean validateForm() {
        if (username.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() ||
                password.isEmpty() || !password.getValue().equals(passwordConfirm.getValue())) {
            errorMessageField.setText("Please fill in all fields correctly and confirm your password.");
            return false;
        }
        errorMessageField.setText("");
        return true;
    }

}
