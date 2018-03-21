package cronapi.watson.personality_insights;

import com.ibm.watson.developer_cloud.personality_insights.v3.PersonalityInsights;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.Profile;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.ProfileOptions;
import cronapi.CronapiMetaData;
import java.util.Map;

@CronapiMetaData
public final class PersonalityInsightsOperations {

  @CronapiMetaData
  public static Profile profile(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ProfileOptions profileOptions) {
    PersonalityInsights service = new PersonalityInsights(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.profile(profileOptions).execute();
  }

  @CronapiMetaData
  public static String getProfileAsCSV(String versionDate, String username, String password,
      String endPoint,
      Map<String, String> headers, ProfileOptions profileOptions, boolean includeHeaders) {
    PersonalityInsights service = new PersonalityInsights(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getProfileAsCSV(profileOptions, includeHeaders).execute();
  }
}
