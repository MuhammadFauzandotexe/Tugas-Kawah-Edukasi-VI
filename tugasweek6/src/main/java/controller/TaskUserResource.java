package controller;
import Model.TaskUser;
import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("resource")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskUserResource {
    @GET
    public List<TaskUser> getDataUser(){
        return TaskUser.listAll();
    }
    @POST
    @Transactional
    public TaskUser addTask(JsonObject body){
        TaskUser taskUser = new TaskUser();
        taskUser.tittle = body.getString("tittle");
        taskUser.description = body.getString("description");
        taskUser.taskNumber = body.getInt("taskNumber");
        taskUser.date = body.getString("date");
        taskUser.time = body.getString("time");
        taskUser.persist();
        return taskUser;
    }
    @PUT
    @Transactional
    @Path("{tasknumber}")
    public JsonObject updateTask(@PathParam("tasknumber")Integer tasknumber, JsonObject body){
        String tittle = body.getString("tittle");
        String description = body.getString("description");
        String date = body.getString("date");
        String time = body.getString("time");
        TaskUser.update("tittle = ?1,description = ?2, date = ?3, time = ?4 where tasknumber = ?5 ",
                tittle,description,date,time,tasknumber);
        return body;
    }
    @DELETE
    @Transactional
    @Path("{taskNumber}")
    public Long deleteTask(@PathParam("taskNumber")Integer taskNumber){
        return TaskUser.delete("tasknumber = ?1",taskNumber);
    }
}
