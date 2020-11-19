import java.awt.*;
import java.applet.Applet;

public class AppletForm extends Applet {
    public void init() {        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(new Label("Name          :"));
        add(new TextField(20));

        add(new Label("Age              :"));
        add(new TextField(20));               

        add(new Label("Gender        :"));
        Choice gender = new Choice(); 
        gender.addItem("Male"); 
        gender.addItem("Female"); 
        Component add = add(gender); 

        add(new Label("Job            :"));
        CheckboxGroup job = new CheckboxGroup();
        add(new Checkbox("Student", job, false));
        add(new Checkbox("Teacher", job, false));
                
        add(new Button("Cancel"));
        add(new Button("OK"));
    }
}
