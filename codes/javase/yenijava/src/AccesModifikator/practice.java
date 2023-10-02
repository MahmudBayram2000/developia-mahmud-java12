package AccesModifikator;

public  class practice{

        public String Name;
        public String Surname;
        public int BorningYear;
        public String Adress;
        public int GraduationYear;

        public practice(String n,String s){
            Name=n;
            Surname=s;
        }
        public void PersonNameAndSurname(){
            System.out.println(Name +" "+Surname);
        }
        public practice (int by){
            BorningYear=by;
        }
        public void PersonBorningYear(){
            System.out.println(BorningYear);
        }
        public practice (String adress,int gy){
            Adress=adress;
            GraduationYear=gy;
        }
        public void PersonAdressAndGraduationYear(){
            System.out.println(Adress);
            System.out.println(GraduationYear);

        }

    }
