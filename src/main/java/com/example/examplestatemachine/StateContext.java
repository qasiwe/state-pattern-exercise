package com.example.examplestatemachine;

public class StateContext {

	protected CurrentAction firstAction;
	protected State acceptState;
	protected State rejectState;
	protected State currentState;


	public StateContext() {
		this.acceptState = new AcceptState(this);
		this.rejectState = new RejectState(this);
		this.currentState = this.rejectState;
	}

	public void actionA() {
		this.currentState.actionA();
	}

	public void actionB() {
		this.currentState.actionB();
	}

	public State getAcceptState() {
		return acceptState;
	}

	public boolean isAccept() {
		return currentState.isAccept();
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getRejectState() {
		return rejectState;
	}

	public void setFirstAction(CurrentAction firstAction) {
		this.firstAction = firstAction;
	}

	public CurrentAction getFirstAction() {
		return firstAction;
	}


}
