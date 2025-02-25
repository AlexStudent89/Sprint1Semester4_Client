
//HTTPRestCLIApplicationTest
package client;

import com.keyin.domain.Airport;
import com.keyin.http.cli.HTTPRestCLIApplication;
import com.keyin.http.client.RESTClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class HTTPRestCLIApplicationTest {
    @Mock
    private RESTClient mockRESTClient;

    @Test
    public void testGenerateAirportReport() {
        HTTPRestCLIApplication httpRestCLIApplicationUnderTest = new HTTPRestCLIApplication();

        Airport stJohnsAirport = new Airport();
        stJohnsAirport.setCode("YYT");
        stJohnsAirport.setName("St. John's Airport");
        stJohnsAirport.setId(1L);

        List<Airport> airportList = new ArrayList<>();
        airportList.add(stJohnsAirport);

        Mockito.when(mockRESTClient.getAllAirports()).thenReturn(airportList);

        httpRestCLIApplicationUnderTest.setRestClient(mockRESTClient);

        Assertions.assertTrue(httpRestCLIApplicationUnderTest.generateAirportReport().contains("YYT"));
    }

    @Test
    public void testGenerateAirportReportWithError() {
        HTTPRestCLIApplication httpRestCLIApplicationUnderTest = new HTTPRestCLIApplication();

        RESTClient restClient = new RESTClient();
        restClient.setServerURL("http://localhost:8080/airports");

        httpRestCLIApplicationUnderTest.setRestClient(restClient);

        Assertions.assertTrue(httpRestCLIApplicationUnderTest.generateAirportReport().contains("Error"));
    }
}
