import java.util.Scanner;

public class IN_MENU {
    Scanner inp = new Scanner(System.in);
    int left = 30;
    int luachon;
    int widthString = -50;

    public IN_MENU() {
        luachon = 0;
    }

    public int menu(String string, boolean isDssp_Dskh_Dsnv) {
        int temp = 1;
        do {
            System.out.printf("\n%" + left + "s%" + Math.abs(widthString) + "s|\n", "|",
                    "=".repeat(Math.abs(widthString)));
            System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",+temp+ ". Them " + string + ".");temp++;
            if(isDssp_Dskh_Dsnv){
                System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",+temp+ ". Cap nhat " + string + ".");temp++;
                System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",+temp+ ". Xoa " + string + ".");temp++;
            }
            System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",+temp+ ". Tim kiem " + string + ".");temp++;
            System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",+temp+ ". Hien thi " + string + ".");temp++;
            System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",
                   +temp+ ". Sap xep danh sach " + string + " theo so luong.");temp++;
            System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",
                   +temp+ ". Sap xep danh sach " + string + " theo ten.");temp++;
            if (isDssp_Dskh_Dsnv)
                System.out.printf("%" + left + "s%" + widthString + "s|\n", "|",+temp+ ". Xuat " + string + " tiem nang.");temp++;
            System.out.printf("%" + left + "s%" + widthString + "s|\n", "|","0. Thoat.");
            System.out.printf("%" + left + "s%30s|\n", "|", "=".repeat(Math.abs(widthString)));
            System.out.printf("Lua chon: ");
            try {
                luachon = Integer.parseInt(inp.nextLine());
                if (luachon < 0 || luachon > 10 || (luachon == 10 && !isDssp_Dskh_Dsnv)) {
                    System.out.println("Lua chon khong hop le!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le!!!");
                luachon = -1;
            }
        } while (luachon < 0 || luachon > 10 || (luachon == 10 && !isDssp_Dskh_Dsnv));
        return luachon;
    }
}
