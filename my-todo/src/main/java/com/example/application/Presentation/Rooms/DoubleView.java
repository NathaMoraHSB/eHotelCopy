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

@Route(value = "double", layout = HomepageView.class)
@PageTitle("Double Room")
public class DoubleView extends VerticalLayout {

    public DoubleView() {
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        getStyle().set("max-width", "960px").set("margin", "0 auto");

        createImageGallery();
        createBookingButton();
    }

    private void createImageGallery() {
        H2 roomTitle = new H2("COMFORT DOUBLE ROOM");
        roomTitle.addClassNames(LumoUtility.TextColor.SECONDARY);

        Paragraph roomDescription = new Paragraph(
                "Step into a space where convenience meets style—our Double rooms offer a cozy escape that blends relaxation with a touch of sophistication, perfect for those who travel together and enjoy the finer things in life."
                        +"It offers a breathtaking sea view, creating a peaceful and soothing ambiance, perfect for those in search of relaxation."+
                        " Our hotel offers this type of room in both serene, quiet areas and in more vibrant, energetic sections of the hotel, catering to guests who prefer a tranquil retreat or those who enjoy the dynamic ambiance."+
                        "Additionally, we accommodate both smokers and non-smokers, ensuring comfort and satisfaction for all our guests' preferences."
        );
        roomDescription.addClassNames(LumoUtility.Margin.Vertical.LARGE);

        FlexLayout galleryContainer = new FlexLayout();
        galleryContainer.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        galleryContainer.setAlignItems(Alignment.CENTER);
        galleryContainer.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
        galleryContainer.addClassName("gallery-container");

        String[] imagePaths = {
                "icons/images/Double1.jpg",
                "icons/images/Double2.jpg",
                "icons/images/Double3.jpg"
        };

        for (String imagePath : imagePaths) {
            Image image = new Image(imagePath, "Double Room image");
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
