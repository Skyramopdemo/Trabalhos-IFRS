public class Datetest {
    public static void main(String[] args) {
    
    Date d1 = new Date(3, 23, 2024);

    d1.setAno(2023);
    d1.setDia(13);
    d1.setMes(12);
    System.out.println(d1.getAno());
    
    System.out.println(d1.getDia());
    
    System.out.println(d1.getMes());
    
    System.out.println(d1.displayDate());
    
    
    }
}
