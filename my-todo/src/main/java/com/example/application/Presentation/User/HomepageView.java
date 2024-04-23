package com.example.application.Presentation.User;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Sunset Lagoon Hotel")
@Route("")
public class HomepageView extends AppLayout {

    public HomepageView() {
        DrawerToggle toggle = new DrawerToggle();

        H1 title = new H1("Sunset Lagoon Hotel");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "0");

        SideNav nav = getSideNav();

        Scroller scroller = new Scroller(nav);
        scroller.setClassName(LumoUtility.Padding.SMALL);

        addToDrawer(scroller);
        addToNavbar(toggle, title);
    }

    private SideNav getSideNav() {
        SideNav nav = new SideNav();

        nav.addItem(new SideNavItem("Login", "LoginView", VaadinIcon.SIGN_IN.create()));
        nav.addItem(new SideNavItem("Rooms", "RoomsView", VaadinIcon.WORKPLACE.create()));
        nav.addItem(new SideNavItem("Home", "/", VaadinIcon.HOME.create()));


        SideNavItem kontaktItem = new SideNavItem("Contact", "#", VaadinIcon.ENVELOPE.create());
        nav.addItem(kontaktItem);
        kontaktItem.getElement().addEventListener("click", e -> createContactDialog());

        return nav;
    }

    private void createContactDialog() {
        Dialog kontaktDialog = new Dialog();
        kontaktDialog.add(new H3("Sunset Lagoon Hotel"),
                new Paragraph("500 Aloha Street"),
                new Paragraph("Honolulu, HI 96815"),
                new Paragraph("Phone: (808) 555-0199"),
                new Paragraph("Email: info@paradisecoveresort.com"));

        Button closeButton = new Button("close", e -> kontaktDialog.close());
        kontaktDialog.add(closeButton);

        kontaktDialog.open();
    }



}
