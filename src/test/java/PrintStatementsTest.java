import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrintStatementsTest {

    LocalDateTime dateOperationMock = LocalDateTime.of(2020, 10, 14, 10,00,00);
    private Account account;

    @Before
    public void setUp() {
        /*account = new Account(client);
        account.deposit(4000.0);
        account.withdrawal(1200.0);
        account.deposit(400.0);
        account.withdrawal(500.0);
        when(LocalDateTime.now()).thenReturn(dateOperationMock);*/
    }
}
