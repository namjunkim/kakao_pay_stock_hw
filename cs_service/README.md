특정 고객 거래내역 조회 서비스 개발

developed by : Namjun Kim

- Basic information Development toolkit
IDE : Spring Tool Suite 4 (Version: 4.2.2.RELEASE)
Language : Jave8
Development Framework : spring-boot-2.2.4.RELEASE

- Resolution
먼저 프로젝트에서 필요한 스펙과 제공된 데이터를 확인한 이후에, 기본적인 설계를 시작했습니다. 설계 단계로는 데이터의 그릇이라고 할 수 있는 DTO 설계를 시작으로, 서비스단과 컨트롤러 단으로 나누었습니다. 컨트롤러에서는 가능한 로직을 줄이려고 했고, 서비스단에서 가능한 모든 로직을 구현하도록 하였습니다. 그리고 서비스단 내에서는 기능별로 메소드를 나누었습니다. 따라서 컨트로러에서 호출하는 public 메소드는 가능한 파사드 서비스 형태가 되도록 하였습니다. 메소드를 하나 만들 때마다 Test Code를 만들어서 해당 메소드에 대한 신뢰율을 높히고, 또한 기능을 잘 분산시킬 수 있었습니다. 

기본적이 구조로 
Controller에
HelloController, ReadCustomerInfoController 가 존재합니다.
HelloController는 기본적으로 현재 빌드 및 실행이 잘 되었는가 확인을 위해 존재하는 기본적인 컨트롤러 입니다.
ReadCustomerInfoController에서는 과제에서 명시되었던, 4가지 API가 존재합니다.

Service에
ReadCSVService, TransactionService가 있습니다.
ReadCSVService에서는 과제애서 제공된 cvs파일을 로드하기 위한 서비스가 있습니다.
TransactionService가 핵심 서비스로써,  15개의 메소드가 있습니다. 그 중 4개는 컨트롤러에서 직접 호출되는 메소드이며, 나머지 11개의 메소드는 컨트롤러에서 호출되는 메소드에 대한 기능을 분산해서 가지고 있습니다.

DTO에는 총 9개가 존재합니다.
AmountSumByBranch(지점별 금액 총합) : String brName(지점명), String brCode(지점코드), Long sumAmount(지점별 금액 총합)
AmountSumByBranchByYear(지점별 금액 총합, 연도별) : String year(연도), List<AmountSumByBranchByYearData> amountSumByBranchByYearDataList(지점별 금액 총합 리스트)
AmountSumByBranchByYearData(뷰 용 지점별 금액 총합) : String brName(지점명), String brCode(지점코드), Long sumAmt(지점별 금액 총합)
BranchAccountInfo(계좌정보를 담기 위한 일종의 DAO) : String acctNo(계좌번호), String acctName(계좌명)
BranchInfoDTO(지점정보를 담기 위한 일종의 DAO) : String brCode(관리점 코드), String brName(관리점 명)
BusinessHistoryDTO(거래정보를 담기 위한 일종의 DAO) : String transactionDay(거래일자), Long transactionNo(거래번호), Long amount(금액), Long fee(수수료), String cancellation(취소여부)
HighSumAmountCustomerDTO(년도별 가장 높은 거래금액 고객 반환용) : String year(연도), String name(계좌이름), String acctNo(계좌번호), Long sumAmt(총 금액)
NoneTransctionCustomerDTO(년도별 거래가 없는 고객 반환용) : String year(연도), String name(계좌이름), String acctNo(계좌번호)
ResponseCode(응답용코드) : code(코드번호), message(메세지)


- Build and Execution
빌드 : JRE System Library [JavaSE-1.8], JUnit 4,  Maven
실행 : Spring Boot App 
