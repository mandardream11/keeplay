
import java.io.File;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class EventsTest {

    public static void main(String[] args) throws Exception {
        String environment = "prod";
        if(environment.equalsIgnoreCase("stag")){
        String filePath = "/Users/mandar.vyas/git/Frontend/Events/src/events";
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            //System.out.println("==========" + line + "==========");
            //Get Last Base64 Encoded value & Convert to text
            int lastIndex = line.lastIndexOf(",");
            int prevIndex = line.lastIndexOf(",", lastIndex - 1);
            String encodedValue = line.substring(prevIndex + 1, lastIndex).trim();
            Base64.Decoder decoder = Base64.getMimeDecoder();
            if (encodedValue != null) {
                String dStr = new String(decoder.decode(encodedValue));
                String Str = dStr.substring(dStr.indexOf("{"));
                JSONObject jsonObject = new JSONObject(Str);
                JSONArray jsonArray = (JSONArray) jsonObject.get("batch");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject eventName = (JSONObject) jsonArray.get(i);
                    if (eventName.get("eventName").equals("LocationFetchResponse")) {
                        JSONObject props = (JSONObject) eventName.get("props");
                        String appName = props.get("app_name").toString();
                        String stateId = props.get("stateId").toString();
                        String stateName = props.get("stateName").toString();
                        System.out.println("---------------------");
                        System.out.println("For event " + eventName.get("eventName"));
                        System.out.println("---------------------");
                        System.out.println("App Name : " + appName);
                        System.out.println("State Id : " + stateId);
                        System.out.println("State : " + stateName);
                        System.out.println("---------------------");
                    } else if (eventName.get("eventName").equals("LocationBottomSheetShown")) {
                        JSONObject props = (JSONObject) eventName.get("props");
                        String appName = props.get("app_name").toString();
                        String type = props.get("type").toString();
                        String flow = props.get("flow").toString();
                        System.out.println("For event " + eventName.get("eventName"));
                        System.out.println("---------------------");
                        System.out.println("App Name : " + appName);
                        System.out.println("Type : " + type);
                        System.out.println("Flow : " + flow);
                        System.out.println("---------------------");
                    } else if (eventName.get("eventName").equals("LocationBottomSheetInteracted")) {
                        JSONObject props = (JSONObject) eventName.get("props");
                        String appName = props.get("app_name").toString();
                        String type = props.get("type").toString();
                        String flow = props.get("flow").toString();
                        String selection = props.get("selection").toString();
                        System.out.println("For event " + eventName.get("eventName"));
                        System.out.println("---------------------");
                        System.out.println("App Name : " + appName);
                        System.out.println("Type : " + type);
                        System.out.println("Flow : " + flow);
                        System.out.println("Selection : " + selection);
                        System.out.println("---------------------");
                    } else if (eventName.get("eventName").equals("LocationFetchError")) {
                        JSONObject props = (JSONObject) eventName.get("props");
                        String appName = props.get("app_name").toString();
                        String errorMessage = props.get("errorMessage").toString();
                        System.out.println("For event " + eventName.get("eventName"));
                        System.out.println("---------------------");
                        System.out.println("App Name : " + appName);
                        System.out.println("Error Message : " + errorMessage);
                        System.out.println("---------------------");
                    } else if (eventName.get("eventName").equals("LocationPermissionGranted")) {
                        JSONObject props = (JSONObject) eventName.get("props");
                        String appName = props.get("app_name").toString();
                        String selection = props.get("selection").toString();
                        System.out.println("For event " + eventName.get("eventName"));
                        System.out.println("---------------------");
                        System.out.println("App Name : " + appName);
                        System.out.println("Selection : " + selection);
                        System.out.println("---------------------");
                    }
                }
            }
        }
        }
        else if (environment.equalsIgnoreCase("prod")) {
            String filePath = "/Users/mandar.vyas/git/Frontend/Events/src/events";
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //System.out.println("==========" + line + "==========");
                //Get Last Base64 Encoded value & Convert to text
                int lastIndex = line.lastIndexOf(",");
                int prevIndex = line.lastIndexOf(",", lastIndex -1);
                String encodedValue = line.substring(prevIndex + 1, lastIndex).trim();
                Base64.Decoder decoder = Base64.getMimeDecoder();
                if (encodedValue != null) {
                    String dStr = new String(decoder.decode(encodedValue));
                    String Str = dStr.substring(dStr.indexOf("{"));
                    JSONObject jsonObject = new JSONObject(Str);
                    JSONArray jsonArray = (JSONArray) jsonObject.get("batch");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject eventName = (JSONObject) jsonArray.get(i);
                        if (eventName.get("eventName").equals("LocationFetchResponse")) {
                            JSONObject props = (JSONObject) eventName.get("props");
                            String appName = props.get("app_name").toString();
                            String stateId = props.get("stateId").toString();
                            String stateName = props.get("stateName").toString();
                            System.out.println("---------------------");
                            System.out.println("For event " + eventName.get("eventName"));
                            System.out.println("---------------------");
                            System.out.println("App Name : " + appName);
                            System.out.println("State Id : " + stateId);
                            System.out.println("State : " + stateName);
                            System.out.println("---------------------");
                        } else if (eventName.get("eventName").equals("LocationBottomSheetShown")) {
                            JSONObject props = (JSONObject) eventName.get("props");
                            String appName = props.get("app_name").toString();
                            String type = props.get("type").toString();
                            String flow = props.get("flow").toString();
                            System.out.println("For event " + eventName.get("eventName"));
                            System.out.println("---------------------");
                            System.out.println("App Name : " + appName);
                            System.out.println("Type : " + type);
                            System.out.println("Flow : " + flow);
                            System.out.println("---------------------");
                        } else if (eventName.get("eventName").equals("LocationBottomSheetInteracted")) {
                            JSONObject props = (JSONObject) eventName.get("props");
                            String appName = props.get("app_name").toString();
                            String type = props.get("type").toString();
                            String flow = props.get("flow").toString();
                            String selection = props.get("selection").toString();
                            System.out.println("For event " + eventName.get("eventName"));
                            System.out.println("---------------------");
                            System.out.println("App Name : " + appName);
                            System.out.println("Type : " + type);
                            System.out.println("Flow : " + flow);
                            System.out.println("Selection : " + selection);
                            System.out.println("---------------------");
                        } else if (eventName.get("eventName").equals("LocationFetchError")) {
                            JSONObject props = (JSONObject) eventName.get("props");
                            String appName = props.get("app_name").toString();
                            String errorMessage = props.get("errorMessage").toString();
                            System.out.println("For event " + eventName.get("eventName"));
                            System.out.println("---------------------");
                            System.out.println("App Name : " + appName);
                            System.out.println("Error Message : " + errorMessage);
                            System.out.println("---------------------");
                        } else if (eventName.get("eventName").equals("LocationPermissionGranted")) {
                            JSONObject props = (JSONObject) eventName.get("props");
                            String appName = props.get("app_name").toString();
                            String selection = props.get("selection").toString();
                            System.out.println("For event " + eventName.get("eventName"));
                            System.out.println("---------------------");
                            System.out.println("App Name : " + appName);
                            System.out.println("Selection : " + selection);
                            System.out.println("---------------------");
                        }
                    }
                }
            }
        }
    }
}