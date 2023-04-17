package ElvisMail.elvis.elvismail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre, telefono, ciudad;
        ImageView imagenLetra;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id. tvNombre);
            telefono=(TextView)itemView.findViewById(R.id. tvtelefono);
            ciudad=(TextView)itemView.findViewById(R.id. tvciudad);
            imagenLetra=(ImageView) itemView.findViewById(R.id.imagenView);
        }
    }

    public List<CorreoUsuario> usuarioList;

    public RecyclerViewAdaptador(List<CorreoUsuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_letras,parent, false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(usuarioList.get(position).getNombre());
        holder.telefono.setText(usuarioList.get(position).getTelefono());
        holder.ciudad.setText(usuarioList.get(position).getCiudad());
        holder.imagenLetra.setImageResource(usuarioList.get(position).getImgLetra());
    }

    @Override
    public int getItemCount() {
        return usuarioList.size();
    }
}
