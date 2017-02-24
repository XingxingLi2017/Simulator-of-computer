package PipeLine;
/**
 * The interface of the stage in the pipeline
 * **/

public interface TaskStage {

	/**
	 * process the task and return the next stage of the pipeline
	 * **/
	public TaskStage process();
}
