package movil.unicauca.peliculasappmoviles.attrs;

import android.databinding.BindingAdapter;
import android.net.Uri;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Sebastianl on 26/04/2017.
 */

public class Attrs {

    @BindingAdapter("app:imgUrl")
    public static void setImage(ImageView img, String url){
        Picasso.with(img.getContext()).load(Uri.parse(url)).into(img);
    }
}
