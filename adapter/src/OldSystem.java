class OldSystem {
    /**
     * this will return in XML format
     * @return String
     */
    public String getEmployeeDataXML() {
        return "<employees><employee><id>1</id><name>Upeksha</name></employee></employees>";
    }
}

class NewSystem {
    /**
     * Take input as JSON format
     * @param jsonData
     */
    public void processEmployeeDataInJSON(String jsonData) {
        System.out.println("Processing employee data in JSON format : " + jsonData);
    }
}

/*
* Due to this miss match these classes can't work together. That's why we need a adapter
* */