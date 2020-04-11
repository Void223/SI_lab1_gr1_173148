class Cousre{
    private List<Student> students;

    public Cousre(List<Student> students){
        this.students=students;
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
    }
    public void removeStudent(Student removed){
        students.remove(removed);
    }
    public int Signatures(){
        int num=0;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).hasSignature())
                num++;
        }
        return num;
    }
    public double Average(){
        double sum=0;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).hasSignature())
                sum+=this.students.get(i).getAverage();
        }
        return sum/Signatures();
    }
}
