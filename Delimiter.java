
class Delimiter {
	public static void main(String[] args) {
	
	String delim = ",";
	
		String [] arr = {
	{"gObjID":"00000000-0000-0000-0000-00003813f7c0",
	 "gParID":"00000000-0000-0000-0000-00003813f7bf",
	 "iObjType":400,
	 "iObjState":100,
	 "num":0,"strObjName":"Trash","strFileType":"","dtCreated":"2014-05-20T23:25:24.3500000","strIconName":"trash_empty","lSizeB":0,"strSize":"0 bytes","isFolder":true,"isEverywhereFolder":false,"isUpOneLevel":false,"isTrashObject":false,"isAcceptedSyncShare":false,"isVersion":false,"iShareID":0,"iPermissions":0,"iSharerNode":0,"strAccessKey":null,"isTrashActionEnabled":true},
		 			 {"gObjID":"00000000-0000-0000-0000-00003813f7c5","gParID":"00000000-0000-0000-0000-00003813f7bf","iObjType":700,"iObjState":100,"num":0,"strObjName":"My Computers","strFileType":"","dtCreated":"2014-05-20T23:25:24.3500000","strIconName":"screen_aqua","lSizeB":0,"strSize":"0 bytes","isFolder":true,"isEverywhereFolder":false,"isUpOneLevel":false,"isTrashObject":false,"isAcceptedSyncShare":false,"isVersion":false,"iShareID":0,"iPermissions":0,"iSharerNode":0,"strAccessKey":null,"isTrashActionEnabled":false},
		 			 {"gObjID":"00000000-0000-0000-0000-00003822eca8","gParID":"00000000-0000-0000-0000-00003813f7bf","iObjType":100,"iObjState":125,"num":0,"strObjName":"Everywhere","strFileType":"","dtCreated":"2014-05-21T20:51:01.2270000","strIconName":"globeFolderIcon","lSizeB":0,"strSize":"0 bytes","isFolder":true,"isEverywhereFolder":true,"isUpOneLevel":false,"isTrashObject":false,"isAcceptedSyncShare":false,"isVersion":false,"iShareID":0,"iPermissions":0,"iSharerNode":0,"strAccessKey":null,"isTrashActionEnabled":false}
		};

	Scanner scan = new Scanner(arr); 
	StringTokenizer st = new StringTokenizer();
	String line = "";
	String result ="";
		while(scan.hasNextLine()){
			line = scan.nextLine(); 
			result = st.nextToken(line, ",");
			System.out.println(result);
		}
	}
}

