package com.example.examplestatemachine;

public class AcceptState extends State{


   	public AcceptState(StateContext context) {
            this.sc = context;
            this.accept = true;
        }

        public void actionA() {
            if (sc.getFirstAction()== null) {
                sc.setCurrentState(sc.getAcceptState());
                sc.setFirstAction(CurrentAction.A_action);
            } else {
                if(sc.getFirstAction() == (CurrentAction.A_action)){
                    sc.setCurrentState(sc.getAcceptState());
                }else{
                    sc.setCurrentState(sc.getRejectState());
                }
            }
        }

        public void actionB() {
            if (sc.getFirstAction()== null) {
                sc.setCurrentState(sc.getAcceptState());
                sc.setFirstAction(CurrentAction.B_action);
            } else {
               if(sc.getFirstAction()== (CurrentAction.B_action)){
                   sc.setCurrentState(sc.getAcceptState());
               }else{
                   sc.setCurrentState(sc.getRejectState());
               }
            }
        }
}
