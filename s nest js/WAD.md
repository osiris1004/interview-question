## 1:How to handle Cross-Origin Resource Sharing (CORS) with NestJS? <br> Comment gérer le partage de ressources (CORS) avec NestJS ?

- app.enableCors();
- app.cors();
- <ok>const app = await NestFactory.create(AppModule, { cors: true });<ok>
- const app = await NestFactory.create(AppModule, { cors: { origin: 'url_d_origine' } });

const app = await NestFactory.create(AppModule, { cors: { origin: 'url_d_origine' } });
## 2:Which of the following items is not a predefined interceptor in Nest.js? <br> Lequel des éléments suivants n'est pas un interceptor prédéfini dans Nest.js ?
- FilesInterceptor
- <ok>TransformInterceptor<ok>
- ClassSerializerInterceptor
- LoggingInterceptor
## 3:Which of these objects is injected into the constructor of a custom Guard to obtain details about the current request? <br> Lequel de ces objets est injecté dans le constructeur d'un Guard personnalisé pour obtenir des détails sur la requête en cours ?
- <ok>ExecutionContext<ok>
- RouterContext
- GuardContext
- NestExecutionContext

## 4:How do you declare a value provider in Nest.js? <br> Comment déclarez-vous un provider de type valeur dans Nest.js ?
By declaring it in the providers array of a module with a specific syntax.

## 5:Which interface must a Guard implement in Nest.js to determine whether a request should be handled or not?<br> Quelle interface un Guard doit-il implémenter dans Nest.js pour déterminer si une requête doit être traitée ou non ?
- GuardActivate
- GuardProvider
- <ok>CanActivate<ok>
- ActivateGuard

## 7:What method of the ConfigModule would allow you to load an asynchronous configuration?<br>Quelle méthode du ConfigModule vous permettrait de charger une configuration asynchrone ?
- asynchrone()
- loadAsync()
- <ok>forRootAsync()<ok>
- asyncConfig()
## 8:How can you associate an ExceptionFilter with a specific controller or route?<br>Comment pouvez-vous associer un ExceptionFilter à un contrôleur ou une route spécifique ?




## 9:What is the main responsibility of an ExceptionFilter in Nest.js?<br>Quelle est la principale responsabilité d'un ExceptionFilter dans Nest.js ?
- Filtrer les requêtes entrantes.

## 10:<br> Quel est le rôle principal des Guards dans Nest.js ?
Gérer le rendu des vues

## 12:!!<br>Examinez le code suivant d'un module Nest.js :
```
@Module({
  imports: [],
  controllers: [ProductsController],
  providers: [ProductsService],
})
export class ProductsModule {}
Laquelle des affirmations suivantes est vraie concernant ce code ?
```

- Le module --ProductsModule-- déclare --ProductsController-- pour gérer les requêtes associées à ce module.
- --ProductsModule-- importe d'autres modules, comme indiqué par le tableau imports.
- --ProductsService est-- exporté et peut être utilisé par d'autres modules qui importeraient --ProductsModule--.
- <ok>--ProductsController-- peut directement utiliser tous les services de n'importe quel autre module sans les importer.<ok>

## 13:<br>Qu'est-ce qu'un middleware dans Nest.js ?
- <ok>Une fonction qui est exécutée avant le route handler.<ok>
- Une classe qui implémente l'interface ExceptionFilter
- Une fonction qui transforme la réponse du serveur.
- Une méthode pour stocker des données dans une base de données.

## 14:<br>
Quelle option pouvez-vous utiliser pour ignorer l'absence de fichier .env lors de l'initialisation de ConfigModule ?
- <ok>ignoreFile: true<ok>
- <ok>ignoreEnvFile: true<ok>
- skipEnv: true
- bypassFile: true

## 15:<br>Dans le contexte de Nest.js, que permet la bibliothèque class-validator ?
- Créer des décorateurs personnalisés.
- Construire des microservices.
- <ok>Valider automatiquement les objets en fonction de certaines règles de validation définies.<ok>
- Gérer la persistance des données dans une base de données.

## 16:<br>Dans le cadre de la déclaration de providers, quel est le rôle spécifique de useFactory ?
- Déterminer le cycle de vie du provider.
- Attribuer des rôles ou permissions aux utilisateurs.
- <ok>Instancier un provider en fonction de logiques ou configurations dynamiques<ok>
- Intégrer des dépendances externes au module


## 17:<br>Quelle commande permet de démarrer l'application en mode développement avec la prise en charge du rechargement à chaud (hot-reloading) ?
- nest run dev
- <ok>nest start --watch<ok>
- nest start --hot
- nest serve --reload

## 18:<br>Comment pourriez-vous, avec useFactory, initialiser un provider qui dépend de données asynchrones obtenues à partir d'une API distante ?
- En retournant directement le résultat de l'API.
- <ok>En utilisant une promesse ou une fonction asynchrone dans la factory.<ok>
- En utilisant le décorateur @Async() au-dessus de la fonction factory.
- En faisant appel à une fonction de rappel (callback) à l'intérieur de useFactory.

## 19:<br>Quelle commande utilise-t-on pour initialiser un nouveau projet Nest.js à l'aide de la CLI ?
- nest create nom-du-projet
- nest init nom-du-projet
- nest start nom-du-projet
- <ok>nest new nom-du-projet<ok>

## 20:<br>Soit le code suivant :
```
@Module({
  providers: [
    {
      provide: 'DATABASE_SERVICE',
      useFactory: (configService: ConfigService) => {
        return new DatabaseService(configService.get('DATABASE_URL'));
      }
    }
  ]
})
export class AppModule {}
```
Quelle est l'erreur dans la déclaration du provider ?
- Le module ne comprend pas l'importation du ConfigService.
- <ok>Il manque la propriété inject nécessaire pour injecter ConfigService dans la fonction de la useFactory.<ok>
- On ne peut pas utiliser la méthode get directement sur ConfigService.
- La clé DATABASE_SERVICE n'est pas correctement formatée.

## 21:<br>Examinez le code suivant d'un service Nest.js :
```
@Injectable()
export class MyService {
  @Inject('LibraryService')
  private libraryService: LibraryService;
}
```
Laquelle des affirmations suivantes est vraie concernant ce code ?

- LibraryService est une classe qui doit être définie dans le même module que MyService.
- <ok>libraryService est une propriété de MyService où LibraryService est injecté via l'injection basée sur les propriétés.<ok>
- Le code provoquera une erreur car @Inject() ne peut être utilisé que dans les constructeurs.
- LibraryService est un alias pour un autre service qui sera automatiquement résolu par Nest.js.


## 22:<br>Quel décorateur est nécessaire pour définir un module ?
- @Controller()
- @Service()
- <ok>@Module()<ok>
- @Injectable()


## 23:<br>Dans quel cas serait-il pertinent d'utiliser un décorateur personnalisé plutôt qu'un Pipe intégré ?
- Extraire un champ spécifique de l'en-tête de la requête.
- Valider la structure d'un objet DTO entrant.
- Convertir des types de données simples, comme des chaînes en nombres.
- Injecter des données d'utilisateurs authentifiés directement comme paramètre de méthode


## 24:<br>Quelle est la différence entre les propriétés providers et exports dans la définition d'un module Nest.js ?
- <ok>providers enregistre des services ou d'autres classes pour l'injection de dépendances à l'intérieur du module, tandis que exports détermine les services ou classes qui peuvent être utilisés par d'autres modules qui importent ce module.<ok>
- providers est utilisé pour définir des routes, alors que exports est utilisé pour définir des contrôleurs.
- Les deux propriétés servent au même objectif et sont donc interchangeables.
- providers est uniquement pour les services externes au module, tandis que exports est pour les services destinés à être partagés.


## 25:<br>Quelle commande est utilisée pour créer un nouveau module dans Nest.js ?
- nest g service nom-du-module
- nest generate controller nom-du-module
- <ok>nest g module nom-du-module<ok>
- nest new module nom-du-module


## 26:<br>Lequel des éléments suivants ne fait partie des propriétés d'un module ?
- providers
- controllers
- imports
- <ok>routes<ok>
- exports


## 27:<br>Comment pouvez-vous personnaliser le scope d'un provider dans Nest.js ?
- <ok>En utilisant le décorateur @Scoped()<ok>
- En définissant la propriété scope lors de la création du provider.
- En l'exportant dans un module différent.
- En utilisant le décorateur @Singleton()


## 28:<br>Quels sont les différents scopes disponibles pour un provider dans Nest.js ?
- <ok>Singleton<ok>
- Component
- Module
- <ok>Request<ok>
- <ok>Transient<ok>
- Service


## 29:<br>Comment peut-on accéder à une variable de configuration spécifique avec le ConfigService ?
- configService.retrieve('NOM_VARIABLE')
- configService.variable('NOM_VARIABLE')
- configService.env('NOM_VARIABLE')
- <ok>configService.get<string>('NOM_VARIABLE')<ok>


## 30:<br>Quels sont les frameworks que Nest.js peut utiliser pour le traitement des requêtes HTTP ?
- <ok>Express.js<ok>
- Hapi.js
- Koa.js
- <ok>Fastify<ok>


## 31:<br>Quel décorateur vous permet de récupérer le contexte de requête HTTP dans Nest.js ?
- @Query()
- <ok>@Request()<ok>
- @Param()
- @Response()


## 32:<br>Comment pouvez-vous définir un type GraphQL dans Nest.js ?
- En utilisant le décorateur @Type()
- <ok>En utilisant le décorateur @ObjectType()<ok>
- En utilisant le décorateur @GraphQLType()
- En utilisant le décorateur @GraphEntity()


## 33:<br>Examinez le code ci-dessous:

@Controller('cats')
export class CatsController {
  @Get()
  findAll(): string {
    return 'This action returns all cats';
  }
}
Quelle URL serait utilisée pour accéder à la méthode findAll() ?
- /
- <ok>/cats<ok>
- /findAll
- /cats/findAll


## 34:<br>Quel est l'objectif principal des "asynchronous providers" dans Nest.js ?
- Exécuter du code en parallèle pour améliorer les performances.
- Résoudre des dépendances de manière asynchrone.
- <ok>Fournir une manière de déclarer des providers qui seront instanciés plus tard.<ok>
- Gérer les références circulaires entre les providers.


## 35:<br>Lorsque vous déclarez un provider dans le tableau providers d'un module, mais que vous ne l'ajoutez pas au tableau exports, que se passe-t-il ?
- Il est disponible globalement dans toute l'application.
- Il ne peut être injecté qu'à l'intérieur du module où il est déclaré.
- Il génère automatiquement une route associée.
- Il est automatiquement transformé en singleton.


## 36:<br>Pourquoi et quand utiliseriez-vous le décorateur @Optional() lors de l'injection de dépendances ?
- Pour rendre la dépendance facultative dans les tests unitaires seulement.
- Pour marquer une dépendance comme de faible importance.
- <ok>Lorsque vous souhaitez injecter plusieurs instances d'une dépendance.<ok>
- Lorsque la dépendance injectée peut être absente sans causer d'erreur.

## 37:<br>Est-il recommandé de stocker des informations sensibles, comme des mots de passe, directement dans un fichier .env ?
- Oui, car le fichier .env est crypté.
- <ok>Non, il est préférable d'utiliser des solutions de gestion de secrets ou d'autres mécanismes de protection.<ok>
- Oui, tant que le fichier .env n'est pas versionné avec Git.
- Cela dépend de la politique de sécurité de l'entreprise.


## 38:<br>Qu'est-ce que Nest.js ?
- Un framework frontend basé sur JavaScript
- Une bibliothèque pour le développement d'applications mobiles
- <ok>Un framework backend pour construire des applications Node.js efficaces et évolutives<ok>
- Un système de gestion de bases de données


## 39:<br>Considérez l'extrait de code suivant:
```
@Post()
async create(@Body() createCatDto: CreateCatDto) {
  this.catsService.create(createCatDto);
}
```
Quel est le rôle du décorateur @Body() dans cet extrait ?
- Il renvoie le corps de la réponse.
- <ok>Il extrait l'objet du corps de la requête entrante.<ok>
- Il sert à valider le corps de la requête entrante.
- Il transforme le corps de la requête en une réponse formatée.


## 30:<br>Quelle méthode doit-on définir lors de la création d'un interceptor personnalisé ?
- transform()
- <ok>intercept()<ok>
- handle()
- process()


## 40:<br>Qu'est-ce qu'un interceptor dans Nest.js ?
- Un décorateur permettant d'ajouter des métadonnées à une méthode.
- Une classe qui implémente NestInterceptor.
- <ok>Un mécanisme pour ajouter une logique avant ou après l'exécution d'une méthode.<ok>
- Un service qui est injecté directement dans les contrôleurs.


## 41:<br>Dans quelles situations utiliseriez-vous les méthodes switchToHttp ou switchToWs dans un guard ou un interceptor Nest.js ?
- <ok>Pour accéder au contexte sous-jacent, comme l'objet de requête HTTP ou l'objet de socket Web, à partir de l'execution context<ok>
- Pour changer le protocole de communication de l'application à la volée.
- Pour transformer la réponse d'une requête HTTP en une réponse WebSocket.
- Pour activer ou désactiver les WebSockets dans l'application.


## 42:<br>Comment pouvez-vous rendre un module "global" dans Nest.js ?
- En l'important dans le module AppModule
- <ok>En utilisant le décorateur @Global()<ok>
- En le plaçant dans un dossier spécifique
- En l'ajoutant à un tableau globals dans le module principal


## 43:<br>Pourquoi utiliseriez-vous forwardRef dans Nest.js ?
- Pour améliorer les performances en chargeant les providers de manière asynchrone.
- <ok>Pour créer une référence vers un module ou un provider qui n'est pas encore défini à cause d'une référence circulaire.<ok>
- Pour référer à des versions futures d'un module ou d'un provider.
- Pour activer la mise en cache des providers.

## 44:<br>


## 45:<br>Pourquoi utilise-t-on des modules dans Nest.js ?
- <ok>Pour organiser le code en unités réutilisables<ok>
- <ok>Pour faciliter le découplage des fonctionnalités<ok>
- Pour augmenter la vitesse d'exécution de l'application
- <ok>Pour créer des frontières claires entre les fonctionnalités<ok>


## 46:<br>Quelle est la principale utilité de l'interface OnModuleInit dans Nest.js ?
- <ok>Elle fournit une méthode pour exécuter une logique lorsque le module est initialisé.
- Elle permet d'initialiser les routes du module.
- Elle crée un middleware pour le module.
- Elle permet d'injecter des dépendances dans le module.


## 47:<br>Dans quel ordre les méthodes liées au cycle de vie des modules sont-elles exécutées ?
- onModuleInit, onApplicationShutdown, onModuleDestroy
- onApplicationShutdown, onModuleDestroy, onModuleInit
- <ok>onModuleInit, onModuleDestroy, onApplicationShutdown
- onModuleDestroy, onModuleInit, onApplicationShutdown


## 48:<br>Dans Nest.js, comment définiriez-vous un service ou un composant qui peut être injecté ?
- En utilisant le décorateur @Service()
- <ok>En utilisant le décorateur @Injectable()
- En utilisant le décorateur @Provider()
- En utilisant le décorateur @Component()


## 49:<br>Quel décorateur est utilisé pour associer un Guard à une route ou un contrôleur ?
- @Guard()
- **@UseGuards()**
- @ApplyGuard()
- @GuardProvider()


## 50:<br>Comment pouvez-vous rendre un ExceptionFilter global afin qu'il s'applique à l'ensemble de votre application ?
- En l'ajoutant au tableau providers dans le module principal.
- En utilisant la méthode useGlobalFilters() de la classe AppModule.
- **En utilisant la méthode useGlobalFilters() de la classe NestFactory.**
- En l'ajoutant au tableau imports dans le module principal.


## 51:<br>Quelle est la principale responsabilité d'un pipe dans Nest.js ?
- Attraper et traiter les exceptions.
- Exécuter du code avant et après le route handler.
- **Transformer ou valider les données entrantes.**
- Gérer les réponses sortantes.


## 52:<br>Dans Nest.js, quel décorateur utilisez-vous pour déclarer une classe en tant que contrôleur ?
- @Route
- **@Controller**
- @Component
- @Module
## 53:<br>
## 53:<br>