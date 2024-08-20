# Exception
스파르타 다락방 Exception

## STEP 1
> FileInputStream 은 파일을 읽는데 사용하는 클래스 입니다.<br>
> FileOutputStream 은 파일을 작성하는데 사용하는 클래스 입니다.<br>
> 파일은 컴파일 타임에서 오류가 있습니다.
- Checked Exception을 이해 합니다.
- Checked Exception은 반드시 예외 처리를 해야 함을 이해 합니다.
- 예외 처리 방식은 자유 입니다.
  - try-catch, finally
  - throws

## STEP 2
> 파일은 런타임에서 오류가 있습니다.<br>
> 배열의 index 가 배열의 length 를 벗어나면서 발생하는 오류를 예외 처리해야 합니다. <br>
- Unchecked Exception을 이해 합니다.
- Unchecked Exception은 예외 처리를 강제하지 않음을 이해 합니다.
- 정상 작동 중에 예외가 발생할 수 있음을 이해 합니다.
- try-catch 를 이용 합니다.
- Unchecked Exception의 슈퍼 클래스를 이용하여 catch 합니다.

## STEP 3
> FileInputStream, FileOutputStream 은 사용 후 close() method 를 이용하여 stream 을 close 해야 시스템 리소스를 해제 합니다.<br>
> STEP 1의 예외 처리를 try-catch, finally 를 이용하여 완성 합니다.
- try-catch, finally 실행 순서를 이해 합니다.
- finally 는 반드시 실행됨을 이해 합니다.
- finally 에서 예외가 발생하면 예외 발생 코드 라인 이하로 수행되지 않음을 이해 합니다.

## STEP 4
> STEP 2의 예외 처리에 커스텀 Exception 을 생성하여 사용 합니다.<br>
- Custom Exception 을 생성하여 Exception 을 예외 처리할 수 있음을 이해 합니다.
- RuntimeException 을 Custom Exception 으로 변환하여 throws 합니다.
- main method 에서 catch 하여 Exception message 를 System.out.println() 으로 출력하여 예외를 처리 합니다.
