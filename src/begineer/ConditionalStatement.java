package begineer;

public class ConditionalStatement {
    public static void main(String[] args) {

//        if(conditional expression 1) {
//             statement block 1
//        } else if (conditional expression 2) {
//             statement block 2
//        } else if (conditional expression 3 ) {
//              statement block 3
//        } else {
//              statement block 4
//        }
//        switch (expression) {
//            case value1:
//                // statement block 1
//                break;
//            case value2:
//                // statement block 2
//                break;
//            case value3:
//                // statement block 3
//                break;
//            default:
//                // statement block 4
//        }
//        WAP to find out the grading system
        // O -> Outstanding
        // E -> Excellent
        // A -> Average
        // default -> Fail
        char grade = 'O';
//        if(grade == 'O') {
//            System.out.println("Outstanding");
//        } else if(grade == 'E') {
//            System.out.println("Excellent");
//        } else if(grade == 'A') {
//            System.out.println("Average");
//        } else {
//            System.out.println("Fail");
//        }
        switch (grade) {
            case 'O':
                System.out.println("Outstanding");
                break;
            case 'E':
                System.out.println("Excellent");
                break;
            case 'A':
                System.out.println("Average");
                break;
            default:
                System.out.println("Fail");
        }

        int[] arr = {1,2,3};
        arr[0]= 10;

        String str = "soumya"; // "soumya" -> 100 location
        // string constant pool -> "soumya" => 100 address
        str = str.concat("sambit");// "soumya" + "sambit" // "soumyasambit"
        // string constant pool -> "soumyasambit" => 200 address
        // str will point to 200 address
        str = str.concat(" sambit"); // "soumya sambit" -> 50 location
//        String st2 = "sambit";
//        str[0] = 'C';
        System.out.println(str.charAt(2));

    }
}
