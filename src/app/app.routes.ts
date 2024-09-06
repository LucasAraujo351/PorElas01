import { Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { SignUpComponent } from './pages/signup/signup.component';
import { DicasComponent } from './pages/dicas/dicas.component';
import { CapacitacaoComponent } from './pages/capacitacao/capacitacao.component';
import { DireitoComponent } from './pages/direito/direito.component';
import { HomeComponent } from './pages/home/home.component'; 
import { LojaComponent } from './pages/loja/loja.component';
import { PagamentoComponent } from './pages/pagamento/pagamento.component';


import { UserComponent } from './pages/user/user.component';
import { AuthGuard } from './services/auth-guard.service';


export const routes: Routes = [
    {
        path: "",
        component: HomeComponent // Definindo a Home como a rota principal
    },
    {
        path: "dicas",
        component: DicasComponent
    },
    {
        path: "direito",
        component: DireitoComponent
    },
    {
        path: "capacitacao",
        component: CapacitacaoComponent
    },
    {
        path: "loja",
        component: LojaComponent
    },
    {
        path: "pagamento",
        component: PagamentoComponent,
       // canActivate: [AuthGuard]
    },
    {
        path: "login",
        component: LoginComponent
    },
    {
        path: "signup",
        component: SignUpComponent
    },
    {
        path: "user",
        component: UserComponent,
        canActivate: [AuthGuard]
    }
];
