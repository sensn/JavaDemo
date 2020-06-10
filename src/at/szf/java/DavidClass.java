package at.szf.java;

public class DavidClass implements IntFilter {
    @Override
    public boolean isValid(int number) {
        return number > 0 && number <= 100;
    }
}
