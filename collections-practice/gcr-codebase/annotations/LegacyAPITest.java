package annotations;

class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is deprecated. Do not use it.");
    }

    public void newFeature() {
        System.out.println("New feature is recommended.");
    }
}

public class LegacyAPITest {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // Deprecated method
        api.newFeature();   // Recommended method
    }
}
