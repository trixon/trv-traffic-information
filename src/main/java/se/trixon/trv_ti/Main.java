/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.trixon.trv_ti;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;
import se.trixon.trv_ti.railroad.trainmessage.v1_6.RESULT;

/**
 *
 * @author Patrik Karlström
 */
public class Main {

    private TrafficInformation mTrafficInformation = new TrafficInformation("96ec3bff3ff34b0f956604b3e0ff828f");

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException, JAXBException {
        new Main();
    }

    public Main() throws IOException, InterruptedException, JAXBException {
        String request1 = "<FILTER>\n"
                //                + "      <EQ name=\"AffectedLocation\" value=\"Cst\" />\n"
                + "    </FILTER>\n"
                + "    <INCLUDE>StartDateTime</INCLUDE>\n"
                + "    <INCLUDE>LastUpdateDateTime</INCLUDE>\n"
                + "    <INCLUDE>ExternalDescription</INCLUDE>\n"
                + "    <INCLUDE>ReasonCodeText</INCLUDE>\n";
        List<RESULT> trainMessageResults = mTrafficInformation.railroad().getTrainMessageResults(null, request1, new File("/home/pata/trafikinfo_1.xml"));
//        RESPONSE results = mTrafikinformation.railroad().getResults(se.trixon.trv_trafikinformation.railroad.trainmessage.v1_6.RESPONSE.class, request1, null);

//        System.out.println(mTrafikinformation.getHttpResponse(request));
        System.out.println(trainMessageResults);
        System.out.println(trainMessageResults.get(0));
//        System.out.println(trainMessageResults.get(0).getERROR().getMESSAGE());
//        System.out.println(trainMessageResults.get(0).getERROR().getSOURCE());
//        System.out.println(trainMessageResults.get(0).getINFO());
        System.out.println(trainMessageResults.get(0).getTrainMessage().get(0).getExternalDescription());
        String request2 = "            <FILTER>\n"
                + "                  <EQ name=\"Advertised\" value=\"true\" />\n"
                + "            </FILTER>\n"
                + "            <INCLUDE>AdvertisedLocationName</INCLUDE>";
        List<se.trixon.trv_ti.railroad.trainstation.v1.RESULT> trainStationResults = mTrafficInformation.railroad().getTrainStationResults(null, request2, new File("/home/pata/trafikinfo_2.xml"));

//        System.out.println(mTrafikinformation.getHttpResponse(request));
        System.out.println(trainStationResults);

        System.out.println("xxx".repeat(100));
        List<se.trixon.trv_ti.railroad.trainstation.v1.RESULT> trainStationResults2 = mTrafficInformation.railroad().getTrainStationResults(new File("/home/pata/trafikinfo_2.xml"));
        System.out.println(trainStationResults2.get(0).getTrainStation().get(0).getAdvertisedLocationName());

//
        mTrafficInformation.road().getCameraResults(null, null, new File("/home/pata/trafikinfo_road_camera.xml"));
        mTrafficInformation.road().getTrafficSafetyCameraResults(null, null, new File("/home/pata/trafikinfo_road_safety_camera.xml"));
        mTrafficInformation.road().getWeatherStationResults(null, null, new File("/home/pata/trafikinfo_road_weather.xml"));
    }

}
