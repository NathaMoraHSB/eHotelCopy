package com.example.application.Presentation.Rooms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.theme.lumo.LumoUtility;
import com.example.application.Presentation.User.HomepageView;

@Route(value = "suite", layout = HomepageView.class)
@PageTitle("JUNIOR SUITE")
public class SuiteView extends VerticalLayout {

    public SuiteView() {
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        getStyle().set("max-width", "960px").set("margin", "0 auto");

        createImageGallery();
        createBookingButton();
    }

    private void createImageGallery() {
        H2 roomTitle = new H2("JUNIOR SUITE");
        roomTitle.addClassNames(LumoUtility.TextColor.SECONDARY);

        Paragraph roomDescription = new Paragraph(
                "Indulge in the epitome of luxury and comfort—our Suite rooms are designed to be your personal haven of elegance and spaciousness, promising an unforgettable stay that caters to your every need."+
                        "It offers a breathtaking sea view, creating a peaceful and soothing ambiance, perfect for those in search of relaxation."+
                        "Our hotel offers this type of room in both serene, quiet areas and in more vibrant, energetic sections of the hotel, catering to guests who prefer a tranquil retreat or those who enjoy the dynamic ambiance."+
                        "Additionally, we accommodate both smokers and non-smokers, ensuring comfort and satisfaction for all our guests' preferences."
        );
        roomDescription.addClassNames(LumoUtility.Margin.Vertical.LARGE);

        FlexLayout galleryContainer = new FlexLayout();
        galleryContainer.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        galleryContainer.setAlignItems(Alignment.CENTER);
        galleryContainer.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
        galleryContainer.addClassName("gallery-container");

        String[] imagePaths = {
                "icons/images/Suite1.jpg",
                "icons/images/Suite2.jpg",
                "icons/images/Suite3.jpg"
        };

        for (String imagePath : imagePaths) {
            Image image = new Image(imagePath, "JUNIOR SUITE image");
            image.addClassNames("room-image");
            image.setWidth("100%");
            image.setHeight("auto");

            VerticalLayout card = new VerticalLayout(image);
            card.addClassName("image-card");
            card.setWidth("30%");
            card.setAlignItems(Alignment.CENTER);

            galleryContainer.add(card);
        }

        add(roomTitle, roomDescription, galleryContainer);
    }

    private void createBookingButton() {
        Button bookButton = new Button("Book Now", e -> {/* Navigationslogik hier, z.B. Buchungsdialog anzeigen */});
        bookButton.addThemeName("primary");
        bookButton.addClassName("book-button");

        // Button in einem horizontalen Layout zentrieren
        HorizontalLayout buttonLayout = new HorizontalLayout(bookButton);
        buttonLayout.setWidthFull();
        buttonLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);

        add(buttonLayout);
    }
}
