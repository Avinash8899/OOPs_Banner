public class UC3 {
    public static void main(String[] args) {
        String gap = "   "; 
        String[] row1 = {"  OOO  ", "  OOO  ", " PPPP   ", " SSSS  "};
        String[] row2 = {" O   O ", " O   O ", " P   P ", " S     "};
        String[] row3 = {" O   O ", " O   O ", " PPPP  ", "  SSS  "};
        String[] row4 = {" O   O ", " O   O ", " P     ", "     S "};
        String[] row5 = {"  OOO  ", "  OOO  ", " P     ", " SSSS  "};
        System.out.println(String.join(gap, row1));
        System.out.println(String.join(gap, row2));
        System.out.println(String.join(gap, row3));
        System.out.println(String.join(gap, row4));
        System.out.println(String.join(gap, row5));
    }
}