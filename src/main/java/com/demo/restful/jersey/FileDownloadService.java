package com.demo.restful.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.io.File;

@Path("/files")
public class FileDownloadService {
    private static final String TXT_PATH = "D:\\myfile.txt";
    private static final String IMAGE_PATH = "D:\\myimage.png";
    private static final String PDF_PATH = "D:\\mypdf.pdf";

    @GET
    @Path("/txt")
    @Produces("text/plain")
    public Response getFile() {
        File file = new File(TXT_PATH);

        ResponseBuilder response = Response.ok((Object) file);
        String download_filename = "yiibai_file.txt";
        response.header("Content-Disposition", "attachment; filename=" + download_filename);
        return response.build();
    }

    @GET
    @Path("/image")
    @Produces("image/png")
    public Response getImage() {
        File file = new File(IMAGE_PATH);
        String filename = "yiibai_image.png";
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=" + filename);
        return response.build();
    }

    @GET
    @Path("/pdf")
    @Produces("application/pdf")
    public Response getPdf() {
        File file = new File(PDF_PATH);
        String filename = "yiibai_pdf.pdf";
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=" + filename);
        return response.build();
    }

}


