package study.whiteship.bytecode.codecoverage;

public class Moim {

    int maxNumberOfAttendees;  //최대 참가자
    int numberOfEnrollment;  //신청수

    //신청이 꽉 찼는지 확인하는 메서드
    public boolean isEnrollmentFull() {
        if (maxNumberOfAttendees == 0) {
            return false;
        }

        if (numberOfEnrollment < maxNumberOfAttendees) {
            return false;
        }

        return true;
    }
}
