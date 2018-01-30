package psi.vici.com.psi;

import org.junit.Test;

import psi.vici.com.psi.models.PsiResponse;
import psi.vici.com.psi.services.ApiService;
import retrofit2.Call;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getPsiData_isCorrect() throws Exception {
        ApiService service = ApiService.retrofit.create(ApiService.class);
        Call<PsiResponse> psiCall = service.getPSIData();
        assertNotNull(psiCall.execute().body());
    }
}