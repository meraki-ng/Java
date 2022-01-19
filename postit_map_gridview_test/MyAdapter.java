

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

class MyAdapter extends BaseAdapter {
    Context context;
    int layout;
    LayoutInflater inf;
    List<String> inputString;

    public MyAdapter(Context context, int layout, List<String> inputString) {
        this.context = context;
        this.layout = layout;
        this.inputString = inputString;
        inf = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return inputString.size();
    }

    @Override
    public Object getItem(int position) {
        return inputString.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
        convertView = inf.inflate(layout, null);
        TextView iv = convertView.findViewById(R.id.imageView1);
        iv.setText(inputString.get(position));
        return convertView;
    }
}
