package Assignment_2;

/**
 * Coordinates tourism and agricultural activities.
 *
 * Implements TourGuide and FarmActivityManager.
 *
 * @author Student
 * @version 1.0
 */
public class AgroTourCoordinator
        implements TourGuide, FarmActivityManager {

    /** {@inheritDoc} */
    @Override
    public void guideTour() {
        System.out.println(
            "Tour Guide: Explains local attractions, culture, and safety rules."
        );
    }

    /** {@inheritDoc} */
    @Override
    public void manageFarmActivity() {
        System.out.println(
            "Farm Activity: Organises seed planting and seasonal harvesting."
        );
    }

    /** Displays the combined tourism package. */
    public void showPackage() {
        System.out.println(
            "Package: A guided village walk followed by a farm experience."
        );
    }
}
