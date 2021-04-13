package structural.adapter;

public class VITStudent implements Student{
    @Override
    public String getName() {
        return "Sushrut";
    }

    @Override
    public String getRegistrationNumber() {
        return "17BCE2387";
    }

    @Override
    public int getAdmissionYear() {
        return 2017;
    }
}
