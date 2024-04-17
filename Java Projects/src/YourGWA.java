import java.util.Scanner;

public class YourGWA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.print("Enter your Programming \"Performance Task 1\" Percentage: ");
        double progPT1 = scanner.nextDouble();
        System.out.print("Enter your Programming \"Q1 Performance Task 2\" Percentage: ");
        double progPT2 = scanner.nextDouble();
        System.out.print("Enter your Programming \"Q1 Written Work 1\" Percentage: ");
        double progWW1 = scanner.nextDouble();
        System.out.print("Enter your Programming \"Q1 Written Work 2\" Percentage: ");
        double progWW2 = scanner.nextDouble();
        System.out.print("Enter your Programming \"Exam\" Percentage: ");
        double progExam = scanner.nextDouble();

        double progPTpercentage = (progPT1 + progPT2) / 200 * 25;
        double progWWpercentage = (progWW1 + progWW2) / 200 * 50;
        double progExampercentage = progExam / 100 * 25;

        double progAverage = (progPTpercentage + progWWpercentage + progExampercentage);

        System.out.print("Enter your Physical Education & Health average: ");
        double peAverage = scanner.nextDouble();

        System.out.print("Enter your Personal Development average: ");
        double pdevAverage = scanner.nextDouble();

        System.out.print("Enter your Empowerment Technologies average: ");
        double etechAverage = scanner.nextDouble();

        System.out.print("Enter your General Mathematics average: ");
        double mathAverage = scanner.nextDouble();

        System.out.print("Enter your Komunikasyon at Pananaliksik \"Long Quiz 1\" Percentage: ");
        double kompanPT1 = scanner.nextDouble();
        System.out.print("Enter your Komunikasyon at Pananaliksik \"Long Quiz 2\" Percentage: ");
        double kompanPT2 = scanner.nextDouble();
        System.out.print("Enter your Komunikasyon at Pananaliksik \"Written Work 1\" Percentage: ");
        double kompanWW1 = scanner.nextDouble();
        System.out.print("Enter your Komunikasyon at \"Performance Task 1\" Percentage: ");
        double kompanWW2 = scanner.nextDouble();
        System.out.print("Enter your Komunikasyon at Pananaliksik \"Exam\" Percentage: ");
        double kompanExam = scanner.nextDouble();

        double kompanPTpercentage = (kompanPT1 + kompanPT2) / 200 * 25;
        double kompanWWpercentage = (kompanWW1 + kompanWW2) / 200 * 50;
        double kompanExampercentage = kompanExam / 100 * 25;

        double kompanAverage = (kompanPTpercentage + kompanWWpercentage + kompanExampercentage);

        System.out.print("Enter your 21st Century Literature \"Long Quiz 1\" Percentage: ");
        double literaturePT1 = scanner.nextDouble();
        System.out.print("Enter your 21st Century Literature \"Long Quiz 2\" Percentage: ");
        double literaturePT2 = scanner.nextDouble();
        System.out.print("Enter your 21st Century Literature \"Written Work 1\" Percentage: ");
        double literatureWW1 = scanner.nextDouble();
        System.out.print("Enter your 21st Century Literature \"Performance Task 1\" Percentage: ");
        double literatureWW2 = scanner.nextDouble();
        System.out.print("Enter your 21st Century Literature \"Exam\" Percentage: ");
        double literatureExam = scanner.nextDouble();

        double literaturePTpercentage = (literaturePT1 + literaturePT2) / 200 * 25;
        double literatureWWpercentage = (literatureWW1 + literatureWW2) / 200 * 50;
        double literatureExampercentage = literatureExam / 100 * 25;

        double literatureAverage = (literaturePTpercentage + literatureWWpercentage + literatureExampercentage);

        System.out.print("Enter your Oral Communication \"Long Quiz 1\" Percentage: ");
        double oralcommPT1 = scanner.nextDouble();
        System.out.print("Enter your Oral Communication \"Long Quiz 2\" Percentage: ");
        double oralcommPT2 = scanner.nextDouble();
        System.out.print("Enter your Oral Communication \"Written Work 1\" Percentage: ");
        double oralcommWW1 = scanner.nextDouble();
        System.out.print("Enter your Oral Communication \"Performance Task 1\" Percentage: ");
        double oralcommWW2 = scanner.nextDouble();
        System.out.print("Enter your Oral Communication \"Exam\" Percentage: ");
        double oralcommExam = scanner.nextDouble();

        double oralcommPTpercentage = (oralcommPT1 + oralcommPT2) / 200 * 25;
        double oralcommWWpercentage = (oralcommWW1 + oralcommWW2) / 200 * 50;
        double oralcommExampercentage = oralcommExam / 100 * 25;

        double oralcommAverage = (oralcommPTpercentage + oralcommWWpercentage + oralcommExampercentage);

        System.out.print("Enter your Earth and Life Science \"Long Quiz 1\" Percentage: ");
        double sciencePT1 = scanner.nextDouble();
        System.out.print("Enter your Earth and Life Science \"Long Quiz 2\" Percentage: ");
        double sciencePT2 = scanner.nextDouble();
        System.out.print("Enter your Earth and Life Science \"Written Work 1\" Percentage: ");
        double scienceWW1 = scanner.nextDouble();
        System.out.print("Enter your Earth and Life Science \"Performance Task 1\" Percentage: ");
        double scienceWW2 = scanner.nextDouble();
        System.out.print("Enter your Earth and Life Science \"Exam\" Percentage: ");
        double scienceExam = scanner.nextDouble();

        double sciencePTpercentage = (sciencePT1 + sciencePT2) / 200 * 25;
        double scienceWWpercentage = (scienceWW1 + scienceWW2) / 200 * 50;
        double scienceExampercentage = scienceExam / 100 * 25;

        double scienceAverage = (sciencePTpercentage + scienceWWpercentage + scienceExampercentage);

        double gwa = (progAverage + peAverage + pdevAverage + etechAverage + mathAverage + kompanAverage
                + literatureAverage + oralcommAverage + scienceAverage) / 9;

        System.out.println("Grade Summary:");
        System.out.println("Programming - " + progAverage + '%');
        System.out.println("Physical Education & Health - " + peAverage + '%');
        System.out.println("Personal Development - " + pdevAverage + '%');
        System.out.println("Empowerment Techonologies - " + etechAverage + '%');
        System.out.println("General Mathematics - " + mathAverage + '%');
        System.out.println("Komunikasyon at Pananaliksik - " + kompanAverage + '%');
        System.out.println("21st Century Literature - " + literatureAverage + '%');
        System.out.println("Oral Communication - " + oralcommAverage + '%');
        System.out.println("Earth and Life Science - " + scienceAverage + '%');

        System.out.println(fullname + " your General Weighted Average is: " + gwa + '%');

    }
}
