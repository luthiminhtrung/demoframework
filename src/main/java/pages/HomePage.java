package pages;

import dataProvider.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class HomePage extends BasePage {
    public HomePage(EventFiringWebDriver driver) {
        super(driver);
    }

    public void goToHomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return this.getLoginPage();
    }

    public FramesPage clickFrame(){
        clickLink("Frames");
        return this.getFramesPage();
    }

    public DropDownPage clickDropDownLink() {
        clickLink("Dropdown");
        return this.getDropDownPage();
    }


//    public DropdownPage clickDropDown(){
//        clickLink("Dropdown");
//        return new DropdownPage(driver);
//    }
//
//    public HoversPage clickHovers(){
//        clickLink("Hovers");
//        return new HoversPage(driver);
//    }
//
//    public KeyPressesPage clickKeyPresses(){
//        clickLink("Key Presses");
//        return new KeyPressesPage(driver);
//    }
//
//    public AlertsPage clickJavaScriptAlerts(){
//        clickLink("JavaScript Alerts");
//        return new AlertsPage(driver);
//    }
//
//    public FileUploadPage clickFileUpload(){
//        clickLink("File Upload");
//        return new FileUploadPage(driver);
//    }
//
//    public WysiwygEditorPage clickWysiwygEditor(){
//        clickLink("WYSIWYG Editor");
//        return new WysiwygEditorPage(driver);
//    }
//
//    public LargeAndDeepDomPage clickLargeAndDeepDom(){
//        clickLink("Large & Deep DOM");
//        return new LargeAndDeepDomPage(driver);
//    }
//
//    public InfiniteScrollPage clickInfiniteScroll(){
//        clickLink("Infinite Scroll");
//        return new InfiniteScrollPage(driver);
//    }
//
//    public DynamicLoadingPage clickDynamicLoading(){
//        clickLink("Dynamic Loading");
//        return new DynamicLoadingPage(driver);
//    }
//
//    public MultipleWindowsPage clickMultipleWindows(){
//        clickLink("Multiple Windows");
//        return new MultipleWindowsPage(driver);
//    }
//
//    private void clickLink(String linkText){
//        driver.findElement(By.linkText(linkText)).click();
//    }
//
//    /*=====================================
//       METHODS FOR INDIVIDUAL EXERCISES
//     ======================================*/
//
//    public ForgotPasswordPage clickForgotPassword(){
//        clickLink("Forgot Password");
//        return new ForgotPasswordPage(driver);
//    }
//
//    public HorizontalSliderPage clickHorizonalSlider(){
//        clickLink("Horizontal Slider");
//        return new HorizontalSliderPage(driver);
//    }
//
//    public ContextMenuPage clickContextMenu(){
//        clickLink("Context Menu");
//        return new ContextMenuPage(driver);
//    }
//
//    public FramesPage clickFramesPage(){
//        clickLink("Frames");
//        return new FramesPage(driver);
//    }




}
