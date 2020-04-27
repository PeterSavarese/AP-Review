public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String sMessage) {
        int colonIndex = sMessage.indexOf(":"); // Split/explode the string at this token

        machineId = sMessage.substring(0, colonIndex); // Our machine ID
        description = sMessage.substring(colonIndex + 1); // Our description
    }

    public boolean containsWord(String keyword) {
        int iWordPos = description.indexOf(keyword); // get starting pos of our keyword

        if (iWordPos == 0) { return false; }

        if (description.charAt(iWordPos - 1) == ' ' || description.charAt(iWordPos - 1) == ':') {
            return true;
        }
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
