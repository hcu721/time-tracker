package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
    
    /** add function */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }
    
    /** remove function */
    public void remove(TimeEntry entry) {     
        entries.remove(entry);
    }
    
    /** size function */
    public int size() {
        return entries.size();
    }
    
    /** get function */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}
