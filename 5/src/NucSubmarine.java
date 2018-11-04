public class NucSubmarine
{
    public class EngineOfNucSubmarine
    {
        void startSubmarineEngine()
        {
            System.out.println("The engine of the nuclear submarine started!");
        }
    }

    public void launchNucSubmarine()
    {
        EngineOfNucSubmarine engineOfSub = new EngineOfNucSubmarine();
        System.out.println("Submarine is preparing to launch!");
        engineOfSub.startSubmarineEngine();
        System.out.println("Submarine is launched!");
    }

    @SubmarineAnnotation(missiles = 5,name = "Leningrad",started = true)
    public NucSubmarine()
    {
        launchNucSubmarine();
    }
}
