package bites.examples;

public class TenDayDiary implements GenericDiary {

    String[] finiteDiary = new String[3];

    @Override
    public void addEntry(String entry) {
        for (int index = 0; index < entry.length(); index++) {
            if (this.finiteDiary[index] == null) {
                this.finiteDiary[index] = entry;
                break;
            }
        }
    }

    @Override
    public void removeEntry(int entryIndex) {
        this.finiteDiary[entryIndex] = null;
    }

    @Override
    public String readEntry(int entryIndex) {
        return this.finiteDiary[entryIndex];
    }

    public static void main(String[] args) {
        TenDayDiary tenDayDiary = new TenDayDiary();
        tenDayDiary.addEntry("Hello, World.");
        tenDayDiary.addEntry("I regret adding this message.");
        System.out.println("Deleted entry: " + tenDayDiary.readEntry(1));
        tenDayDiary.removeEntry(1);
        System.out.printf(tenDayDiary.readEntry(0));
    }
}
