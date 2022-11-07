package Task7;

abstract class Learner {
    public static void main(String[] args) {
        Learner[] Learner = new Learner[2];
        Learner[0] = new SchoolLearner();
        Learner[1] = new Student();
    }
}
