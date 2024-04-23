package com.example.application.Presentation.Customer;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.Presentation.User.HomepageView;

@PageTitle("Sunset Lagoon Hotel - Customer")
@Route(value = "CustomerView", layout = HomepageView.class)
public class CustomerView extends HomepageView {

    public CustomerView() {
        super();
        createImageGallery();
    }

    private void createImageGallery() {
        FlexLayout galleryContainer = new FlexLayout();
        galleryContainer.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        galleryContainer.setAlignItems(Alignment.CENTER);
        galleryContainer.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        galleryContainer.addClassName("gallery-container");
        galleryContainer.setWidthFull();


        String[] imagePaths = {
                "icons/images/Single1.jpg",
                "icons/images/Double1.jpg",
                "icons/images/Deluxe1.jpg",
                "icons/images/Suite1.jpg",
                "icons/images/family1.jpg"
        };


        String[] titles = {
                "COMFORT SINGLE ROOM",
                "COMFORT DOUBLE ROOM",
                "PREMIUM DELUXE ROOM",
                "JUNIOR SUITE",
                "PREMIUM FAMILY"
        };


        for (int i = 0; i < imagePaths.length; i++) {
            VerticalLayout card = createGalleryCard(
                    titles[i],
                    "Card subtitle",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                    "Details",
                    imagePaths[i]
            );
            galleryContainer.add(card);
        }


        setContent(galleryContainer);
    }

    private VerticalLayout createGalleryCard(String title, String subtitle, String description, String label, String imagePath) {
        VerticalLayout card = new VerticalLayout();
        card.addClassName("gallery-card");
        card.setWidth("200px");


        Image image = new Image(imagePath, "Image not available");
        image.addClassName("card-image");
        image.setHeight("150px");

        H2 titleHeader = new H2(title);
        titleHeader.addClassName("card-title");

        Paragraph subtitleParagraph = new Paragraph(subtitle);
        subtitleParagraph.addClassName("card-subtitle");

        Paragraph descriptionParagraph = new Paragraph(description);
        descriptionParagraph.addClassName("card-description");

        Button labelButton = new Button(label);
        labelButton.addClassName("card-label");

        card.add(image, titleHeader, subtitleParagraph, descriptionParagraph, labelButton);
        card.setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        return card;
    }
}

