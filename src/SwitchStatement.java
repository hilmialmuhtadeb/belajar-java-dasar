public class SwitchStatement {

    public static void main(String[] args) {
        char nilai = 'C';
        String ucapan = switch (nilai) {
            case 'A' : yield "Selamat anda lulus dengan sempurna";
            case 'B', 'C' : yield "Selamat anda lulus";
            case 'D' : yield "Anda tidak lulus";
            default : yield "Silahkan mengulang";
        };

        System.out.println(ucapan);
    }

}
