package student;


class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public String calculate(){
        String grade = null;
        int average = 0;
        int result = 0;
        for(int i=0; i< testScores.length;i++){
            average= average+testScores[i];
        }
        result = average/testScores.length;
        if(result>= 90 && result<=100){
            grade = "O";
        }else if(result>= 80 && result < 90){
            grade = "E";
        }else if(result>= 70 && result < 80){
            grade = "A";
        }else if(result>= 55 && result < 70){
            grade = "P";
        }else if(result>= 40 && result < 55){
            grade = "D";
        }else if(result < 40){
            grade = "T";
        }
//        System.out.println("Grade:"+grade);

        return grade;
    }
}
