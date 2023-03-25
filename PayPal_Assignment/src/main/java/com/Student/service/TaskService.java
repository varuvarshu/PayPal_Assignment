package com.Student.service;

import java.util.List;

import com.Student.execption.TaskException;
import com.Student.model.Task;

public interface TaskService {
	public List<Task> getAllTask();
	public Task registerTask(Task task);
	public Task deleteTask(String taskId) throws TaskException ;
	public Task updateTask(Task task)  throws TaskException;
	

}
