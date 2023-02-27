package com.study.refactoring._14_lazy_elements.collapse_hierarchy;


//나중에 확장을 고려해 서브클래스 만든 경우 의도대로 안쓸경우에는 바로 지워버리기
public class CourtReservation extends Reservation {

    private String courtNumber;

}
