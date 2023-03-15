package Controller;
import Model.HasilKebun;
import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Path("hasilkebun")
public class HasilKebunResource {
    @GET
    public List<HasilKebun> getData(){
        return HasilKebun.listAll();
    }
    @POST
    @Transactional
    public HasilKebun addData(JsonObject body){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        HasilKebun hasilKebun = new HasilKebun();
        hasilKebun.total = body.getInt("total");
        hasilKebun.komoditas = body.getString("komoditas");
        hasilKebun.createdat = dtf.format(date).toString();
        hasilKebun.updatedat = dtf.format(date).toString();
        hasilKebun.persist();
        return hasilKebun;
    }
    @PUT
    @Path("{uuid}")
    @Transactional
    public JsonObject editHasilKebun(@PathParam("uuid")String uuid, JsonObject body){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        Integer total = body.getInt("total");
        String updatedAt = dtf.format(date).toString();
        HasilKebun.update("total = ?1,updatedat = ?2 where id = ?3",total,updatedAt,uuid);
        return body;
    }
    @DELETE
    @Path("{uuid}")
    @Transactional
    public Long deleteHasilKebun(@PathParam("uuid")String uuid){
        return HasilKebun.delete("id = ?1",uuid);
    }
}
