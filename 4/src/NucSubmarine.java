public class NucSubmarine
{
    private class EngineOfNucSubmarine
    {
        void startSubmarineEngine()
        {
            System.out.println("The engine of the nuclear submarine started!");
        }
    }

    private EngineOfNucSubmarine engineOfSub = new EngineOfNucSubmarine();

    public void launchNucSubmarine()
    {
        System.out.println("Submarine is preparing to launch!");
        engineOfSub.startSubmarineEngine();
        System.out.println("Submarine is launched!");
    }
}
