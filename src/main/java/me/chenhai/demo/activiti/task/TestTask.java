package me.chenhai.demo.activiti.task;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;
//import org.activiti.engine.ProcessEngine;
//import org.activiti.engine.ProcessEngines;
//import org.activiti.engine.RuntimeService;
//import org.activiti.engine.TaskService;
//import org.activiti.engine.task.Task;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.Map;

public class TestTask implements JavaDelegate{

    //流程变量
    private Expression url;

    //重写委托的提交方法

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("serviceTask已经执行已经执行！");
        String value = (String) url.getValue(execution);
        //ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        //RuntimeService runtimeService = engine.getRuntimeService();
        //TaskService taskService = engine.getTaskService();
        //Task task = taskService.createTaskQuery().processInstanceId(String.valueOf(execution.getProcessInstanceId())).active().singleResult();
        //Map<String, Object> variablesMap = runtimeService.getVariables(task.getExecutionId());
        //String url = (String) variablesMap.get("Url");
        //url = (String) execution.getVariable("Url");
        //Map<String, Object> variablesMap = runtimeService.getVariables(execution..getExecutionId());
        //String clientName = (String) variablesMap.get("clientName");
        //String companyName = (String) variablesMap.get("companyName");
        //System.out.println(value1);
        //execution.setVariable("var1", new StringBuffer(value1).reverse().toString());

    }

}