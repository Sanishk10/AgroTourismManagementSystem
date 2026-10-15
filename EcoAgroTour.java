package Assignment_2;

/**
 * Represents an eco-friendly agricultural tourism package.
 *
 * Demonstrates hybrid inheritance using a class and interfaces.
 *
 * @author Student
 * @version 1.0
 */
public class EcoAgroTour extends RuralTour
        implements FarmExperience, EcoFriendly {

    /** {@inheritDoc} */
    @Override
    public void showFarmActivity() {
        System.out.println(
            "Farm Activity: Guests learn about crop rotation and seasonal produce."
        );
    }

    /** {@inheritDoc} */
    @Override
    public void showEcoPractices() {
        System.out.println(
            "Eco Practices: Encourages waste reduction, water conservation, and walking trails."
        );
    }
}
