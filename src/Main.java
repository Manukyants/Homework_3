public class Main {
    public static <yearnew> void main(String[] args) {

        System.out.println ("������� �1 � �2 ");
        System.out.println ("�������� ������������ �������. ������� ������ 0 ��� 1: ");
        System.out.println ("�������� ��� ������������ ��������: ");
        int clientOS = 1;
        int clientDeviceYear = 2005;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        }else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }


        System.out.println( "������� �3 ");
        int year = 1992;
        boolean nameOfTheYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (nameOfTheYear) {
            System.out.println(year + " ��� �������� ���������� ");
        }else {
            System.out.println(year + " ��� �� �������� ����������");
        }


        System.out.println("������� �4");
        int deliveryDistance = 95;
        if (deliveryDistance < 19){
            System.out.println(" ���� ������� 1 ����");
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60){
            System.out.println(" ���� �������� 2 ���");
        }
        if (deliveryDistance >= 61 && deliveryDistance <= 100){
            System.out.println(" ���� �������� 3 ���");

        }

        System.out.println(" ������� �5 ");
        int monthNumber = 12;
        switch (monthNumber = 1){
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("����");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("�����");
                break;
            case 6:
                System.out.println("����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("����");
                break;
            case 9:
                System.out.println("�����");
                break;
            case 10:
                System.out.println("�����");
                break;
            case 11:
                System.out.println("�����");
                break;
            case 12:
                System.out.println("����");
                break;
            default:
                System.out.println(" ������� ���������� ����� �� 1 �� 12 ");


        }














        }






    }