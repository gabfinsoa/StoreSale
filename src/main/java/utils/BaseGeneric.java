package utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseGeneric extends Generic{

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("value")
    @Expose
    public String value;

    public BaseGeneric withParameters(String... args) {
        this.value = String.format(value, args);
        return this;
    }

}
