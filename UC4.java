public class UC4 {
    public static void main(String[] args) {
        String gap = "   ";
        String[] bannerRows = new String[5];
        bannerRows[0] = String.join(gap, "  OOO  ", "  OOO  ", " PPPP   ", " SSSS  ");
        bannerRows[1] = String.join(gap, " O   O ", " O   O ", " P   P ", " S     ");
        bannerRows[2] = String.join(gap, " O   O ", " O   O ", " PPPP  ", "  SSS  ");
        bannerRows[3] = String.join(gap, " O   O ", " O   O ", " P     ", "     S ");
        bannerRows[4] = String.join(gap, "  OOO  ", "  OOO  ", " P     ", " SSSS  ");
        for (String row : bannerRows) {
            System.out.println(row);
        }
    }
}